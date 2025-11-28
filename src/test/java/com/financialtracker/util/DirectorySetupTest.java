package com.financialtracker.util;

import org.junit.Test;
import java.io.File;
import static org.junit.Assert.*;

public class DirectorySetupTest {
    @Test
    public void testDirectoriesCreated() {
        DirectorySetup.setupDirectories();
        
        assertTrue(new File("data").exists());
        assertTrue(new File("logs").exists());
    }
}