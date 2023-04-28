package com.example.ramiltgbot2.entity;


import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "natification_tasks")
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String message;
    @Column(name= "chat_id",nullable = false)
    private long chatId;
    @Column(name= "notificationDateTime",nullable = false)
    private LocalDateTime notificationDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }



        }
