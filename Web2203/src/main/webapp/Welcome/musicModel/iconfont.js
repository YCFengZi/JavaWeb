(window._iconfont_svg_string_ =
  '<svg><symbol id="icon-xiayishou" viewBox="0 0 1024 1024"><path d="M922.069625 477.9341L472.652621 151.089311a43.342807 43.342807 0 0 0-68.847075 35.055725V328.665491L159.636492 151.089311a43.364482 43.364482 0 0 0-68.847076 35.055725v653.682354a43.350032 43.350032 0 0 0 68.847076 35.062951L403.805546 697.328611v142.498779a43.364482 43.364482 0 0 0 68.847075 35.062951l449.417004-326.837565a43.342807 43.342807 0 0 0 0-70.118676z" fill="" ></path></symbol><symbol id="icon-bofang" viewBox="0 0 1024 1024"><path d="M128 138.666667c0-47.232 33.322667-66.666667 74.176-43.562667l663.146667 374.954667c40.96 23.168 40.853333 60.8 0 83.882666L202.176 928.896C161.216 952.064 128 932.565333 128 885.333333v-746.666666z" fill="" ></path></symbol><symbol id="icon-24gf-pause2" viewBox="0 0 1024 1024"><path d="M426.666667 138.666667v746.666666a53.393333 53.393333 0 0 1-53.333334 53.333334H266.666667a53.393333 53.393333 0 0 1-53.333334-53.333334V138.666667a53.393333 53.393333 0 0 1 53.333334-53.333334h106.666666a53.393333 53.393333 0 0 1 53.333334 53.333334z m330.666666-53.333334H650.666667a53.393333 53.393333 0 0 0-53.333334 53.333334v746.666666a53.393333 53.393333 0 0 0 53.333334 53.333334h106.666666a53.393333 53.393333 0 0 0 53.333334-53.333334V138.666667a53.393333 53.393333 0 0 0-53.333334-53.333334z" fill="" ></path></symbol></svg>'),
  (function (n) {
    var t = (t = document.getElementsByTagName("script"))[t.length - 1],
      e = t.getAttribute("data-injectcss"),
      t = t.getAttribute("data-disable-injectsvg");
    if (!t) {
      var o,
        i,
        a,
        d,
        c,
        s = function (t, e) {
          e.parentNode.insertBefore(t, e);
        };
      if (e && !n.__iconfont__svg__cssinject__) {
        n.__iconfont__svg__cssinject__ = !0;
        try {
          document.write(
            "<style>.svgfont {display: inline-block;width: 1em;height: 1em;fill: currentColor;vertical-align: -0.1em;font-size:16px;}</style>"
          );
        } catch (t) {
          console && console.log(t);
        }
      }
      (o = function () {
        var t,
          e = document.createElement("div");
        (e.innerHTML = n._iconfont_svg_string_),
          (e = e.getElementsByTagName("svg")[0]) &&
            (e.setAttribute("aria-hidden", "true"),
            (e.style.position = "absolute"),
            (e.style.width = 0),
            (e.style.height = 0),
            (e.style.overflow = "hidden"),
            (e = e),
            (t = document.body).firstChild
              ? s(e, t.firstChild)
              : t.appendChild(e));
      }),
        document.addEventListener
          ? ~["complete", "loaded", "interactive"].indexOf(document.readyState)
            ? setTimeout(o, 0)
            : ((i = function () {
                document.removeEventListener("DOMContentLoaded", i, !1), o();
              }),
              document.addEventListener("DOMContentLoaded", i, !1))
          : document.attachEvent &&
            ((a = o),
            (d = n.document),
            (c = !1),
            r(),
            (d.onreadystatechange = function () {
              "complete" == d.readyState &&
                ((d.onreadystatechange = null), l());
            }));
    }
    function l() {
      c || ((c = !0), a());
    }
    function r() {
      try {
        d.documentElement.doScroll("left");
      } catch (t) {
        return void setTimeout(r, 50);
      }
      l();
    }
  })(window);
