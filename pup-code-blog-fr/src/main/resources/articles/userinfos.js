<!-- THREE STEPS TO INSTALL BROWSER PROPERTIES:

  1.  Copy the coding into the HEAD of your HTML document
  2.  Add the onLoad event handler into the BODY tag
  3.  Put the last coding into the BODY of your HTML document  -->

<!-- STEP ONE: Paste this code into the HEAD of your HTML document  -->

<
SCRIPT;
LANGUAGE = "JavaScript" >


        <!-- This script and many more are available free online at -->

    < !--The;
JavaScript;
Source;
!!http;
://www.javascriptsource.com -->

<
!--begin;
function display() {
    window.onerror = null;

    colors = window.screen.colorDepth;
    document.form.color.value = Math.pow(2, colors);
    if (window.screen.fontSmoothingEnabled == true)
        document.form.fonts.value = "Yes";
    else document.form.fonts.value = "No";

    document.form.navigator.value = navigator.appName;
    document.form.version.value = navigator.appVersion;
    document.form.colordepth.value = window.screen.colorDepth;
    document.form.width.value = window.screen.width;
    document.form.height.value = window.screen.height;
    document.form.maxwidth.value = window.screen.availWidth;
    document.form.maxheight.value = window.screen.availHeight;
    document.form.codename.value = navigator.appCodeName;
    document.form.platform.value = navigator.platform;
    if (navigator.javaEnabled() < 1) document.form.java.value = "No";
    if (navigator.javaEnabled() == 1) document.form.java.value = "Yes";

    if (navigator.javaEnabled() && (navigator.appName != "Microsoft Internet Explorer")) {
        vartool = java.awt.Toolkit.getDefaultToolkit();
        addr = java.net.InetAddress.getLocalHost();
        host = addr.getHostName();
        ip = addr.getHostAddress();
        alert("Your host name is '" + host + "'\nYour IP address is " + ip);
    }
}
// end -->
</
script >;

<!-- STEP TWO: Insert the onLoad event handler into your BODY tag  -->

