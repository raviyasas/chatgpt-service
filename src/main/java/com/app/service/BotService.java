package com.app.service;

import com.app.model.request.BotRequest;
import com.app.model.response.ChatGptResponse;

public interface BotService {

    ChatGptResponse askQuestion(BotRequest botRequest);
}
