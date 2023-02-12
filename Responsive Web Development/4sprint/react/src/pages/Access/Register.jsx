import React from 'react'
import {Link} from 'react-router-dom'
import Logo3 from '../../img/logo3.png'
import As from '../../img/as.png'
import Gp from '../../img/gp.png'
import Footer from '../../components/footer/Footer'
import './BaseForm.css'
import { useState } from 'react'

export default () =>{

    const [codUsuario, setcodUsuario] = useState('');
    const [statusUsuario, setStatusUsuario] = useState('');
    const [tipoUsuario, setTipoUsuario] = useState('');
    const [senha, setSenha] = useState('');

    const [usuario, setUsuario] = useState({
        codUsuario: "",
        statusUsuario: "",
        tipoUsuario: "",
        senha: "",
    });

    let metodo = "post"

    const handleChange = e=>{
        setUsuario({...usuario, [e.target.name]:e.target.value})
    }

    const handleSubmit = e=>{
        e.preventDefault()

        fetch(`http://localhost:8080/Challenge/rest/usuario`,{
            method: metodo,
            headers:{
                "Content-Type":"application/json"
            },
            body: JSON.stringify(usuario)
        }).then(()=>{
            window.location = "/"
        })
    }
    return(
        <>
        <main>
            <div class="form-data">
            <form name="formuser">
                    <div class="logo">
                        <img src={Logo3} alt=""/>
                    </div>
                    <div className='form' onSubmit={handleSubmit}>
                        <label for="fullName">Nome Completo</label>
                        <input name="fullName" type="text placeholder" value={usuario.titulo} placeholder="Título" onChange={handleChange}/>
                        <label for="user">Nome Usuario</label>
                        <input name="user" type="text"  placeholder="Numero, username ou e-mail" value={usuario.titulo} onChange={handleChange}/>
                        <label for="pass">Senha</label>
                        <input type="password" name="$pass" placeholder="Coloque uma senha dificil"/>
                        <label for="confirmPass">Confirme a Senha</label>
                        <input type="password" name="$confirmPass" placeholder="Confirme a Senha" value={usuario.titulo} onChange={handleChange}/>
                        <label for="email">E-mail</label>
                        <input type="text" name="$email" placeholder="E-mail"/>
                        <label for="cpf">CPF</label>
                        <input type="text" name="$cpf" placeholder="Cpf"/>
                        <label for="CorR">Candidato ou recrutador</label>
                        <input type="text" name="$CorR" placeholder="Cada um com sua funcao"/>
                        <label for="bornIn">Data de Nascimento</label>
                        <input type="text" name="$bornIn" placeholder="dia/mes/ano"/>
                        <button type="text" value="Submit" onclick={console.log("Register")} class="form-btn">Login</button>
                    </div>
                    <span class="has-separator">Or</span>
                    <button type="submit" value="Submit" class="form-btn-fb">
                            <a class ="facebook-login" href="https://www.facebook.com/">
                                Login com facebook
                            </a>
                    </button>
            </form>
            <div class="sign-up">
                Ja tem uma conta? <Link to="/Login">Login</Link>
            </div>
                <div class="get-the-app">
                    <div class="badges">
                        <a href="https://www.appstore.com/"><img src={As}/></a>
                        <a href="https://www.googleplay.com/"><img src={Gp}/></a>
                    </div>
                </div>
            </div>
        </main>
        <Footer/>
        </>
    )
}