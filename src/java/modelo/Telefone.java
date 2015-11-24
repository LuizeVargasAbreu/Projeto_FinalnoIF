/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "telefone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefone.findAll", query = "SELECT t FROM Telefone t"),
    @NamedQuery(name = "Telefone.findByTCodigo", query = "SELECT t FROM Telefone t WHERE t.tCodigo = :tCodigo"),
    @NamedQuery(name = "Telefone.findByTipo", query = "SELECT t FROM Telefone t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Telefone.findByNumero", query = "SELECT t FROM Telefone t WHERE t.numero = :numero")})
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "t_codigo")
    private Long tCodigo;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @JoinColumn(name = "c_codigo", referencedColumnName = "c_codigo")
    @ManyToOne(optional = false)
    private Cliente cCodigo;
    @JoinColumn(name = "o_codigo", referencedColumnName = "o_codigo")
    @ManyToOne(optional = false)
    private Operadora oCodigo;

    public Telefone() {
    }

    public Telefone(Long tCodigo) {
        this.tCodigo = tCodigo;
    }

    public Telefone(Long tCodigo, String tipo, String numero) {
        this.tCodigo = tCodigo;
        this.tipo = tipo;
        this.numero = numero;
    }

    public Long getTCodigo() {
        return tCodigo;
    }

    public void setTCodigo(Long tCodigo) {
        this.tCodigo = tCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCCodigo() {
        return cCodigo;
    }

    public void setCCodigo(Cliente cCodigo) {
        this.cCodigo = cCodigo;
    }

    public Operadora getOCodigo() {
        return oCodigo;
    }

    public void setOCodigo(Operadora oCodigo) {
        this.oCodigo = oCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tCodigo != null ? tCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.tCodigo == null && other.tCodigo != null) || (this.tCodigo != null && !this.tCodigo.equals(other.tCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Telefone[ tCodigo=" + tCodigo + " ]";
    }
    
}
