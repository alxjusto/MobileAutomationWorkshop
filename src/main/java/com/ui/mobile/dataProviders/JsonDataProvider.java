package com.ui.mobile.dataProviders;

import com.google.gson.Gson;
import com.ui.mobile.dtos.CapabilitiesDTO;
import com.ui.mobile.utilities.Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class JsonDataProvider {

    String capabilityFilePath = Utilities.getProperty("mobile.capability.resource") + "mobileCapabilitiesResources.json";
    List<CapabilitiesDTO> capabilitiesDTOList;

    public JsonDataProvider() throws FileNotFoundException {
        capabilitiesDTOList = getCapabilities();
    }

    private List<CapabilitiesDTO> getCapabilities() throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new FileReader(capabilityFilePath));
        CapabilitiesDTO[] capabilities = gson.fromJson(bufferedReader, CapabilitiesDTO[].class);

        return Arrays.asList(capabilities);
    }

    public CapabilitiesDTO getCapability(String capabilityName) {
        return capabilitiesDTOList.stream().filter(capability -> capability.getDeviceName().equalsIgnoreCase(capabilityName)).findAny().get();
    }
}
