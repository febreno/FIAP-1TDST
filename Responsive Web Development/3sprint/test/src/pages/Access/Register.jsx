import React from 'react'
import ContentRegister from '../../components/contentForm/ContentRegister'
import Logo3 from '../../img/logo3.png'
import As from '../../img/as.png'
import Gp from '../../img/gp.png'
import './BaseForm.css'

export default () =>{
    return(
        <div class="form-data">
            <form name="formuser">
                    <div class="logo">
                        <img src={Logo3} alt=""/>
                    </div>
                    <ContentRegister/>
                    <span class="has-separator">Or</span>
                    <button type="submit" value="Submit" class="form-btn-fb">
                            <a class ="facebook-login" href="https://www.facebook.com/">
                                Login com facebook
                            </a>
                    </button>
            </form>
            <div class="sign-up">
                    Ja tem uma conta? <a href="./login.html">Login</a>
            </div>
            <div class="get-the-app">
                    <div class="badges">
                            <a><img src={As}/></a>
                            <a><img src={Gp}/></a>
                    </div>
            </div>
        </div>
    )
}