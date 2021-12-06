import CardList from "./components/CardList";
import posts from "./data/catalogue.js";

function App() {
  return (
    <div className="App">
      <CardList postList={posts} />
    </div>
  );
}

export default App;
