package com.example.anthony.clinicplace;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

/**
 * Created by Anthony on 04/11/2017.
 */
@DynamoDBTable(tableName = "clinicplace-mobilehub-2110396219-Clinica")
public class Clinica {
    private String _userId;
    private String _nombre;
    private String _sede;
    private Double _calificacion;
    private String _descripcion;
    private String _direccionPrincipal;
    private String _doctor;
    private String _especialidad;
    private String _numeroTelefonico;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBRangeKey(attributeName = "Nombre")
    @DynamoDBAttribute(attributeName = "Nombre")
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(final String _nombre) {
        this._nombre = _nombre;
    }
    @DynamoDBAttribute(attributeName = "Sede")
    public String getSede() {
        return _sede;
    }

    public void setSede(final String _sede) {
        this._sede = _sede;
    }
    @DynamoDBAttribute(attributeName = "calificacion")
    public Double getCalificacion() {
        return _calificacion;
    }

    public void setCalificacion(final Double _calificacion) {
        this._calificacion = _calificacion;
    }
    @DynamoDBAttribute(attributeName = "descripcion")
    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(final String _descripcion) {
        this._descripcion = _descripcion;
    }
    @DynamoDBAttribute(attributeName = "direccionPrincipal")
    public String getDireccionPrincipal() {
        return _direccionPrincipal;
    }

    public void setDireccionPrincipal(final String _direccionPrincipal) {
        this._direccionPrincipal = _direccionPrincipal;
    }
    @DynamoDBAttribute(attributeName = "doctor")
    public String getDoctor() {
        return _doctor;
    }

    public void setDoctor(final String _doctor) {
        this._doctor = _doctor;
    }
    @DynamoDBAttribute(attributeName = "especialidad")
    public String getEspecialidad() {
        return _especialidad;
    }

    public void setEspecialidad(final String _especialidad) {
        this._especialidad = _especialidad;
    }
    @DynamoDBAttribute(attributeName = "numeroTelefonico")
    public String getNumeroTelefonico() {
        return _numeroTelefonico;
    }

    public void setNumeroTelefonico(final String _numeroTelefonico) {
        this._numeroTelefonico = _numeroTelefonico;
    }

}
