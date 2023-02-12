function abrirMenu() {
    document.getElementById('menu').style.width = '210px';
}
function fecharMenu() {
    document.getElementById('menu').style.width = '0px';
    document.getElementById('content').style.marginLeft = '0px';
}

var lst = document.querySelectorAll('.showMore p');
for (var i = 0; i < lst.length; i++) {
    let click = 1;
    lst[i].addEventListener('click', function (e) {
        if(click == 1){
            click = 0;
            this.closest('.card').querySelector(".aboutCOff").classList.add('aboutCOn');
            this.closest('.card').querySelector(".aboutCOff").classList.remove('aboutCOff');
        }else{
            click = 1;
            this.closest('.card').querySelector(".aboutCOn").classList.add('aboutCOff');
            this.closest('.card').querySelector(".aboutCOn").classList.remove('aboutCOn');
        }
        //element.style.color = "blue";
        //element.style.cssText  = "color: blue;" ;
        //this.innerHTML
    })
}

// darkmode
//White mode with localstorage
    //get id checkbox in html
    // const toggleSwitch = document.getElementById('checkbox');
    // //get data-theme in css
    // const currentTheme = localStorage.getItem('data-theme');

    // if (currentTheme) {
    //     document.documentElement.setAttribute('data-theme', currentTheme);

    //     if (currentTheme === 'dark') {
    //         toggleSwitch.checked = true;
    //     }
    //     if (currentTheme === 'white') {
    //         toggleSwitch.checked = false;
    //     }
    // }  

    // function switchTheme(e) {
    //     if (!e.target.checked) {
    //         document.documentElement.setAttribute('data-theme', 'white');
    //         localStorage.setItem('data-theme', 'white');
    //     } else{
    //         document.documentElement.setAttribute('data-theme', 'dark');
    //         localStorage.setItem('data-theme', 'dark');  
    //     }
    // } 

    // toggleSwitch.addEventListener('change', switchTheme, false);