/*
 * Copyright (C) Laboratory of Laboratory of Computing,
 * Medical Informatics and Biomedical-Imaging Technologies
 * Aristotle University of Thessaloniki
 * All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Nikolaos Beredimas <beredim@auth.gr>, 2014 - 2019
 */
package com.airhacks.ping.boundary;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author beredim
 */
@RunWith(Arquillian.class)
public class PingResourceIT {    
    
    @Inject
    PingResource pr;
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(PingResource.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    
    public PingResourceIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ping method, of class PingResource.
     */
    @Test
    public void testPing() {
        System.out.println("ping");        
        String expResult = "Enjoy Java EE 8!";
        String result = pr.ping();
        assertEquals(expResult, result);
    }
    
}
