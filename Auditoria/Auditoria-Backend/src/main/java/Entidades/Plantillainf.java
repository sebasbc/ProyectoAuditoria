/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian
 */
@Entity
@Table
public class Plantillainf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "plantillainf_id")
    private Long id;

    @Column(name = "plantillainf_r1")
    private boolean r1;

    @Column(name = "plantillainf_r2")
    private boolean r2;

    @Column(name = "plantillainf_r3")
    private boolean r3;

    @Column(name = "plantillainf_r4")
    private boolean r4;

    @Column(name = "plantillainf_r5")
    private boolean r5;

    @Column(name = "plantillainf_observaciones")
    private String observaciones;

    @OneToOne(mappedBy = "plantillainf", fetch = FetchType.LAZY)
    private Auditoria auditoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isR1() {
        return r1;
    }

    public void setR1(boolean r1) {
        this.r1 = r1;
    }

    public boolean isR2() {
        return r2;
    }

    public void setR2(boolean r2) {
        this.r2 = r2;
    }

    public boolean isR3() {
        return r3;
    }

    public void setR3(boolean r3) {
        this.r3 = r3;
    }

    public boolean isR4() {
        return r4;
    }

    public void setR4(boolean r4) {
        this.r4 = r4;
    }

    public boolean isR5() {
        return r5;
    }

    public void setR5(boolean r5) {
        this.r5 = r5;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

}
