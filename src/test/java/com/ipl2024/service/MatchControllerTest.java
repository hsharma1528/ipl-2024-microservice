package com.ipl2024.service;

import org.junit.Jupiter;
import org.junit.jupiter.api.ExtensionContext;
import org.junit.jupiter.api.beforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.ExtensionContext.Store;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class MatchControllerTest {

    private MatchController matchController;

    @BeforeEach
    public void setUp() {
        matchController = new MatchController();
    }

    @Test
    public void testGetLiveScores() {
        assertThat(matchController.getLiveScores()).isNotNull();
    }

    @Test
    public void testGetMatchUpdates() {
        assertThat(matchController.getMatchUpdates()).isNotNull();
    }
}
