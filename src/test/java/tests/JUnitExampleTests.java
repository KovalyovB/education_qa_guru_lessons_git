package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JUnitExampleTests {
    @BeforeAll
    static void startup() {
        System.out.println("Startup testsNEW");
    }

    @AfterAll
    static void teardowm() {System.out.println("Finish Tests");}

    @BeforeEach
    void startBrowser() {
        System.out.println("- browser has started");
    }

    @AfterEach
    void closeBrowser() {
        System.out.println("- browser has closed");
    }

    @Test
    void firstTest() {
        System.out.println("- -firstTest");
    }

    @Test
        void secondTest() {
            System.out.println("- -secondTest");
        }
    }
