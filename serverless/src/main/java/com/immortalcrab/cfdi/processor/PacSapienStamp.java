package com.immortalcrab.cfdi.processor;

import com.immortalcrab.cfdi.errors.EngineError;
import com.immortalcrab.cfdi.processor.Processor.IStamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PacSapienStamp implements IStamp<PacReply> {

    private @NonNull
    final String login;

    private @NonNull
    final String passwd;

    @Override
    public PacReply impress(final String payload) throws EngineError {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static PacSapienStamp setup(final String carrier, final String login, final String passwd) {

        log.info("Setting up pac: " + carrier);
        return new PacSapienStamp(login, passwd);
    }
}
