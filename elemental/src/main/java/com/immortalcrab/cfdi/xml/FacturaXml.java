package com.immortalcrab.cfdi.xml;

import com.immortalcrab.cfdi.dtos.FacturaRequestDTO;
import com.immortalcrab.cfdi.errors.EngineError;


import java.io.BufferedInputStream;
import java.io.StringWriter;

import lombok.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class FacturaXml {

    private final @NonNull
    FacturaRequestDTO _req;

    private final StringWriter _sw;

    public FacturaXml(FacturaRequestDTO req,
            BufferedInputStream certificate, BufferedInputStream signerKey, final String passwd) throws EngineError {

        _req = req;
        _sw = shape();
    }

    @Override
    public String toString() {
        return _sw.toString();
    }

    private StringWriter shape() throws EngineError {
        return null;
    }
}
