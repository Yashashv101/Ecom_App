# 🎮 Gaming Club App

A **Membership and Game Management System** built using **Spring Boot** and **React** with **MongoDB** for managing gaming center operations such as memberships, games, recharges, transactions, and daily collections.

---

## 🚀 Overview

The **Gaming Club App** provides a digital platform for managing all core operations of a gaming center. It allows administrators to:
- Register members and track their balances
- Add and manage games
- Record game plays and recharges
- Monitor daily collections
- Securely authenticate admin users

This system eliminates manual tracking, improves accuracy, and provides an efficient and scalable solution for gaming center management.

---

## 🧱 Tech Stack

| Layer | Technology |
|-------|-------------|
| **Frontend** | React.js, Axios, Bootstrap/CSS |
| **Backend** | Spring Boot (REST APIs) |
| **Database** | MongoDB (Atlas or Local) |
| **Authentication** | JWT (dummy token currently implemented) |

---

## 🗃️ MongoDB Collections Overview

| Collection | Description |
|-------------|-------------|
| **members** | Stores member details and balance |
| **games** | Stores all available games and their prices |
| **recharges** | Records recharge transactions per member |
| **transactions** | Records each game play and amount deducted |
| **collections** | Tracks daily collection totals |
| **admin_users** | Stores admin credentials |

## 🧩 Key Features

- **Admin Login**  
  Secure authentication (dummy JWT token).
- **Membership Management**  
  Create new members with an initial joining fee.
- **Game Management**  
  Add, edit, and list games with descriptions and prices.
- **Recharge System**  
  Recharge member balances.
- **Game Play Tracking**  
  Deducts balance automatically when a game is played.
- **Collections Page**  
  Displays total daily collections.
- **Detailed Member History**  
  Shows recharge and game play history per member.

---

## 🔌 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| **POST** | `/auth` | Admin login (returns dummy JWT token) |
| **POST** | `/members` | Create new membership |
| **POST** | `/members/search` | Search member by phone |
| **POST** | `/game` | Add new game |
| **POST** | `/play` | Play a game (deducts balance) |
| **GET** | `/collection/{date}` | Fetch daily collection by date |
