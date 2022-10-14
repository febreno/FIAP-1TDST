import React from 'react'
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Header from './components/header/index'
import Home from './pages/home/index'
import MenFashion from './pages/menFashion/index'
import FeminineFashion from './pages/FeminineFashion/index'
import ChildrenFashion from './pages/childrenFashion/index'
import About from './pages/about/index'
import './global.css'

export default () => {
    return(
        <Router>
            <Routes>
                <Header/>
                <Route path='/' element={<Home/>}/>{/* exact principal route */}
                <Route path='/MenFashion' element={<MenFashion/>}/>
                <Route path='/FeminineFashion' element={<FeminineFashion/>}/>
                <Route path='/ChildrenFashion' element={<ChildrenFashion/>}/>
                <Route path='/About' element={<About/>}/>
            </Routes>
        </Router>
    );
}