import { Fragment, useEffect } from "react";
import Sidebar from "../components/layout/sidebar";

import "../styles/globals.css";
import "../styles/scss/main.css";

export default function MyApp({ Component, pageProps }) {
  useEffect(() => {
    require("bootstrap/dist/js/bootstrap.bundle.min.js");
  }, []);

  return (
    <Fragment>
      <Sidebar />
      <Component {...pageProps} />
    </Fragment>
  );
}
