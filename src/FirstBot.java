import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.CallbackQuery;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.updateshandlers.SentCallback;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.log1p;
import static java.lang.Math.toIntExact;

public class FirstBot extends TelegramLongPollingBot {


    private int currentContext=0;


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            procesUpdate(update);
        }}


    @Override
    public String getBotUsername() {
        return "my bot";
    }

    @Override
    public String getBotToken() {
        return "561339821:AAE7HVi2D7QzU2zDsCmOLq6y2kcn942b_lI";
    }



    private void procesUpdate(Update update){

        String message_text = update.getMessage().getText();
        long chat_id = update.getMessage().getChatId();

        if(message_text.equals("/start")){
            SendMessage message=new SendMessage().setChatId(chat_id).setText("Hey Chris I am a robot made by the greatest, coolest and awosme Berhan, So what do you want to do") ;
            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add(EmojiParser.parseToUnicode(":microphone: Add Channel"));
            row.add(EmojiParser.parseToUnicode(":boat: Add Bots"));
            keyboard.add(row);
            row = new KeyboardRow();
            row.add(EmojiParser.parseToUnicode(":lipstick: Add Themes"));
            row.add(EmojiParser.parseToUnicode(":tshirt: Add Stickers"));
            keyboard.add(row);
            row = new KeyboardRow();
            row.add(EmojiParser.parseToUnicode(":video_game: Add Games"));
            row.add(EmojiParser.parseToUnicode("Restart"));
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);
            message.setReplyMarkup(keyboardMarkup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }


        else if (message_text.equals(EmojiParser.parseToUnicode(":microphone: Add Channel"))) {
            currentContext=log.channel;
            SendMessage channelReplay=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode(":smiley: Yee.. new channel."));
            SendMessage title=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode("Tell me the  title"));
            try {
                execute(channelReplay);
                execute(title);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }else if (message_text.equals(EmojiParser.parseToUnicode(":boat: Add Bots"))) {
            currentContext=log.bot;
            SendMessage channelReplay=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode(":smiley: Yee.. new bot."));
            SendMessage title=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode("Tell me the  title"));
            try {
                execute(channelReplay);
                execute(title);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }else if (message_text.equals(EmojiParser.parseToUnicode(":lipstick: Add Themes"))) {
            currentContext=log.thems;
            SendMessage channelReplay=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode(":smiley: Yee.. new Theme."));
            SendMessage title=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode("Tell me the  title"));
            try {
                execute(channelReplay);
                execute(title);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }else if (message_text.equals(EmojiParser.parseToUnicode(":tshirt: Add Stickers"))) {
            currentContext=log.sticker;
            SendMessage channelReplay=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode(":smiley: Yee.. new sticker."));
            SendMessage title=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode("Tell me the  title"));
            try {
                execute(channelReplay);
                execute(title);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }else if (message_text.equals(EmojiParser.parseToUnicode(":video_game: Add Games"))) {
            currentContext=log.game;
            SendMessage channelReplay=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode(":smiley: Yee.. new games."));
            SendMessage title=new SendMessage().setChatId(chat_id).setText(EmojiParser.parseToUnicode("Tell me the  title"));
            try {
                execute(channelReplay);
                execute(title);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }
}
