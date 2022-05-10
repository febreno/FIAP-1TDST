#### initi
- install node
- open cmd
- node-red (get link)

#### install inside node-red
- node-red-node-watson
- node-red-contrib-telegrambot

msg.params = {
    "session_id" : msg.payload.chatId
}
msg.chatId = msg.payload.chatId;
msg.payload = msg.payload.content;

return msg;
