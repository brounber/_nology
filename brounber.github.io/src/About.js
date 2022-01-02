import React from "react";
import "./About.css";
import aboutImg from "./img/about.jpg";
const About = () => {
  //  Up To Top Btn
    window.addEventListener("scroll", function(){
      const upToTop = document.querySelector("a.bottom__to__top");
       upToTop.classList.toggle("active", window.scrollY > 0)
    });
  return (
    <div className="about component__space" id="About">
      <div className="container">
        <div className="heading">
            <h1 className="about__heading">About Me</h1>
            <div className="about__meta">
              <p className="about__text p__color">
              I am a growth-focused IT professional with a strong background in client-facing environments. My professional focal points include software development, information security, data analytics, clean coding, web design, technical support, troubleshooting, and customer relationship management. As I am committed to continuous improvement, I have completed a Software Development Bootcamp via _Nology.io and AZURE fundamentals, and I am currently pursuing my BTech in Computer Science with UTS.
              </p>
              <p className="about__text p__color">
              Throughout my career, I have received accolades for both my technical insights and customer service acumen, and I excel at cultivating and maintaining productive client relationships. I am highly adaptable, and I masted new concepts, tools, and technologies intuitively. Moreover, I am an adept data scientist, and I have a verifiable record of translating extensive volumes of data into actionable business intelligence.
              </p>
              <div className="about__button d__flex align__items__center">
                
                
              </div>
            </div>
          </div>
      </div>
      {/* UP TO TOP BTN */}
      <div className="up__to__top__btn">
        <a href="#" className="bottom__to__top">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="16"
          height="16"
          fill="currentColor"
          class="bi bi-chevron-up white"
          viewBox="0 0 16 16"
        >
          <path
            fill-rule="evenodd"
            d="M7.646 4.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1-.708.708L8 5.707l-5.646 5.647a.5.5 0 0 1-.708-.708l6-6z"
          />
        </svg>
        </a>
      </div>
    </div>
  );
}

export default About;
