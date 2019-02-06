package com.sabre.testContDemo;

import org.testcontainers.utility.DockerMachineClient;
import org.testng.annotations.Test;

public class testDocker {

    @Test
    public void Test123(){
       System.out.println( DockerMachineClient.instance().getDefaultMachine());
        //DockerMachineClient.instance().getDefaultMachine()
        //System.out.println(dockerClient.listImagesCmd());

        //DockerClient abc = DockerClientBuilder;
        //System.out.println("test");
    }
}
