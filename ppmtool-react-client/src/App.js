import './App.css';
import Dashboard from './components/Dashboard';
import Header from "./components/Layout/Header";
import AddProject from "./components/Project/AddProject";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import {Provider} from "react-redux";
import store from "./store";
function App() {
  return (
    <Provider store={store}>
    <Router>
    <div className="App">
    <Header/>
    <Route exact path ='/dashboard' component ={Dashboard}></Route>
    <Route exact path ='/addProject' component ={AddProject}></Route>
    </div>
    </Router>
    </Provider>
  );
}

export default App;
