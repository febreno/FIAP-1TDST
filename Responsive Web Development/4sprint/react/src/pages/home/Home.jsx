import React, { useState, useEffect } from 'react'
import Job from '../../components/cards/CardJob'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import './Home.css'

export default () =>{

    // const [users, setUsers] = useState([])

    // useEffect(()=>{
    //     fetch("http://localhost:8080/Challenge/rest/usuario").then((resp)=>{
    //         return resp.json();
    //     }).then((resp)=>{
    //         setUsers(resp)
    //         console.log(resp)
    //     }).catch((error)=>{
    //         console.log(error)
    //     })
    // })

    // const handleDelete=(id)=>{
    //     fetch(`http://localhost:8080/Challenge/rest/usuario/${id}`,{
    //         method:"delete"
    //     }).then(()=>{
    //         window.location = "/"
    //     }).catch((error)=>{
    //         console.log(error)
    //     })

    // }
    return(
        <>
        <Header/>
        <main>
        <h1>Vagas</h1>
        <div class="search">
            <input type="text" name="iSerach" placeholder="Busque a melhor vaga para voce"/>
            <div className="alignBnt">
                <button>Buscar por Titulo</button>
                <button>Buscar por linguagem</button>
                <button>Buscar por Empresa</button>
            </div>
            <Job/>
            <Job/>
            <Job/>
        </div>
        </main>
        <Footer/>
        </>
    )
}