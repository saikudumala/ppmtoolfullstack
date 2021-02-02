<<<<<<< HEAD
import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";

class Dashboard extends Component {
  render() {
    return (
        <div className="projects">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <h1 className="display-4 text-center">Projects</h1>
              <br />
              <a href="ProjectForm.html" className="btn btn-lg btn-info">
                Create a Project
              </a>
              <br />
              <hr />
              <ProjectItem />
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
=======
import React, { Component } from 'react'
import "bootstrap/dist/css/bootstrap.min.css";
import ProjectItem from "./Project/ProjectItem";
class Dashboard extends Component {
    render() {
        return (
            <div className="projects">
        <div className="container">
            <div className="row">
                <div className="col-md-12">
                    <h1 className="display-4 text-center">Projects</h1>
                    <br />
                    <a href="ProjectForm.html" className="btn btn-lg btn-info">
                        Create a Project
                    </a>
                    <br />
                    <hr />

                    <ProjectItem/>

                </div>
            </div>
        </div>
    </div>   
        )
    }
}
export default Dashboard;
>>>>>>> 06b0780c784afcf8d629ceb0b40de6a912fa7cb5
