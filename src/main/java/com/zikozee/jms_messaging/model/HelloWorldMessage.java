package com.zikozee.jms_messaging.model;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class HelloWorldMessage implements Serializable {
//  Storing data in an object-oriented way to files on disk, e.g. storing a list of Student objects.
//  Saving program’s states on disk, e.g. saving state of a game.
//  Sending data over the network in form objects, e.g. sending messages as objects in chat application.
//  Serializable is a marker interface (contains no methods) that tell the Java Virtual Machine (JVM)
//  that the objects of this class is ready for being written to and read from a persistent storage or over the network.

    static final long serialVersionUID = 42L;//in case you want to use java objects

    private UUID id;
    private String message;

}
