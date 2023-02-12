import React from 'react'
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Home from './pages/home/Home'
import Profile from './pages/profile/Profile'
import Contractation from './pages/contractation/Contractation'
import ChatBot from './pages/chatBot/ChatBot'
import Login from './pages/Access/Login'
import Register from './pages/Access/Register'
import Information from './pages/information/Information'
import Users from './pages/users/Users'
import './App.css'

export default () =>{
    return(
        <Router>
            <Routes>
                <Route path='/' element={<Home/>}/>
                <Route path='/Profile' element={<Profile/>}/>
                <Route path='/Contractation' element={<Contractation/>}/>
                <Route path='/ChatBot' element={<ChatBot/>}/>
                <Route path='/Register' element={<Register/>}/>
                <Route path='/Information' element={<Information/>}/>
                <Route path='/Users' element={<Users/>}/>
                <Route path='/Login' element={<Login/>}/>
            </Routes>
        </Router>
    )
}