package com.forter.contracts.mocks;

import backtype.storm.task.TopologyContext;
import com.forter.contracts.IContractsBolt;
import com.forter.contracts.validation.ContractValidationResult;
import com.google.common.base.Optional;

import java.util.Map;

/**
 * Mocks {@link com.forter.contracts.IContractsBolt}
 */
public class MockOptionalAbsentBolt implements IContractsBolt<MockContractsBoltInput,Optional<MockContractsBoltOutput>> {

    @Override
    public void prepare(Map stormConf, TopologyContext context) {

    }

    @Override
    public Optional<MockContractsBoltOutput> executeValidInput(MockContractsBoltInput input) {
        return Optional.absent();
    }

    @Override
    public Optional<MockContractsBoltOutput> executeInvalidInput(MockContractsBoltInput input, ContractValidationResult violations) {
        return Optional.absent();
    }

    @Override
    public void cleanup() {

    }
}
