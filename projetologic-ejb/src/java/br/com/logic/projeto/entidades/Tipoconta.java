/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logic.projeto.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucas
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoconta.findAll", query = "SELECT t FROM Tipoconta t")})
public class Tipoconta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer idtipoconta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String tipoconta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoconta")
    private List<Transacoes> transacoesList;

    public Tipoconta() {
    }

    public Tipoconta(Integer idtipoconta) {
        this.idtipoconta = idtipoconta;
    }

    public Tipoconta(Integer idtipoconta, String tipoconta) {
        this.idtipoconta = idtipoconta;
        this.tipoconta = tipoconta;
    }

    public Integer getIdtipoconta() {
        return idtipoconta;
    }

    public void setIdtipoconta(Integer idtipoconta) {
        this.idtipoconta = idtipoconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    @XmlTransient
    public List<Transacoes> getTransacoesList() {
        return transacoesList;
    }

    public void setTransacoesList(List<Transacoes> transacoesList) {
        this.transacoesList = transacoesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoconta != null ? idtipoconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoconta)) {
            return false;
        }
        Tipoconta other = (Tipoconta) object;
        if ((this.idtipoconta == null && other.idtipoconta != null) || (this.idtipoconta != null && !this.idtipoconta.equals(other.idtipoconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.logic.projeto.entidades.Tipoconta[ idtipoconta=" + idtipoconta + " ]";
    }
    
}
