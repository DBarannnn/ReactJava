import "./Footer.css";

export default function Footer(){
    return(
        <footer className="footer">
            <p className="footer-text">Bringing Animal Enthusiasts Together</p>
            <div className="footer-contacts">
                <a><img src="src/assets/facebook.png" className="contact-img"></img></a>
                <a><img src="src/assets/twitter.png" className="contact-img"></img></a>
                <a><img src="src/assets/instagram.png" className="contact-img"></img></a>
            </div>
        </footer>
    )

}