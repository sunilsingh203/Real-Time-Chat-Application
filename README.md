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
    
     git clone https://github.com/your-username/chat-app.git
     cd chat-app


### 2. Run the Backend (Spring Boot)
    
    ./mvnw spring-boot:run  # On macOS/Linux
    mvnw.cmd spring-boot:run  # On Windows

### 3. Open the Frontend
Since the frontend also runs on localhost:8080, no additional setup is required. Just access it via your browser.


## WebSocket API Endpoints 🔌  

| Endpoint            | Description                      |
|---------------------|----------------------------------|
| `/chat`            | WebSocket endpoint              |
| `/app/sendMessage` | Clients send messages          |
| `/topic/messages`  | Clients subscribe for updates  |

## Usage 📝  
1. Open the browser and go to **[http://localhost:8080](http://localhost:8080)**.  
2. Enter a name and type a message.  
3. Click **"Send"** and see messages appear instantly.  


##  Future Improvements 🚀
- 🔐 User authentication (Spring Security, JWT)
- 📝 Message history (Store messages in a database)
- 🎨 Enhanced UI/UX with additional ThemeLyf customization

## Contributing 🤝
- Feel free to fork, modify, and submit pull requests!
