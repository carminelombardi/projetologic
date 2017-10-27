/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logic.projeto.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transacoes.findAll", query = "SELECT t FROM Transacoes t")})
public class Transacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 9, scale = 2)
    private BigDecimal valor;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "idtipoconta", referencedColumnName = "idtipoconta", nullable = false)
    @ManyToOne(optional = false)
    private Tipoconta idtipoconta;
    @JoinColumn(name = "idtipotransacao", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Tipotransacao idtipotransacao;
    @JoinColumn(name = "idusuario", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idusuario;

    public Transacoes() {
    }

    public Transacoes(Integer id) {
        this.id = id;
    }

    public Transacoes(Integer id, BigDecimal valor, Date data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tipoconta getIdtipoconta() {
        return idtipoconta;
    }

    public void setIdtipoconta(Tipoconta idtipoconta) {
        this.idtipoconta = idtipoconta;
    }

    public Tipotransacao getIdtipotransacao() {
        return idtipotransacao;
    }

    public void setIdtipotransacao(Tipotransacao idtipotransacao) {
        this.idtipotransacao = idtipotransacao;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transacoes)) {
            return false;
        }
        Transacoes other = (Transacoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.logic.projeto.entidades.Transacoes[ id=" + id + " ]";
    }
    
}
