import React from 'react'
import './TimeLine.css'

export default () => {
    return(
        <div class="progressBar">
            <div class="balls">
                <div class="steps"><p>1</p></div>
                <div class="steps"><p>2</p></div>
                <div class="steps"><p>3</p></div>
                <div class="steps"><p>4</p></div>
                <div class="steps"><p>5</p></div>
            </div>
            <div class="line"></div>
        </div>
    )
}
