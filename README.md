# Real-Time Chat Application 🚀  

A simple real-time chat application built using **Spring Boot**, **WebSockets**, **STOMP**, and **SockJS** for instant messaging.

## Features ✨  
- 📡 **WebSocket Communication**: Uses STOMP over WebSockets for real-time updates.  
- 💬 **Live Chat**: Users can send and receive messages instantly.  
- 🎨 **Bootstrap UI**: Responsive frontend using Bootstrap 5.  
- 🔄 **Auto-Reconnect**: WebSocket reconnects if the connection is lost.  

## Tech Stack 🛠  
### **Backend (Spring Boot)**
- **Spring WebSocket** – WebSocket messaging with STOMP protocol.  
- **Spring Boot Starter Web** – For REST API and WebSocket support.  
- **Spring Boot Starter Messaging** – To handle STOMP messages.  

### **Frontend**
- **HTML, CSS, JavaScript** – Basic UI and WebSocket client.  
- **Bootstrap 5** – For styling.  
- **stomp.js & sockjs-client** – To handle WebSockets.  

## Installation & Setup ⚙️  

### **1. Clone the Repository**
```sh
git clone https://github.com/your-username/chat-app.git
cd chat-app
