package com.immortalcrab.cfdi.toolbox;

import com.immortalcrab.cfdi.errors.EngineError;
import java.io.BufferedReader;
import javax.xml.transform.Source;

public interface IToolbox {

    public String renderCerticate(byte[] chunk) throws EngineError;

    public String renderOriginal(BufferedReader br, Source srcXslt) throws EngineError;

    public String signOriginal(BufferedReader brPrivKeyPem, String original) throws EngineError;
}
