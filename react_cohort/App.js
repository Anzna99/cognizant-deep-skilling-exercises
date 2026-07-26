import "./App.css";
import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <h1>My Academy Dashboard</h1>

      <CohortDetails
        name="React Bootcamp"
        startDate="01-Jan-2026"
        status="Ongoing"
        coach="John"
        trainer="David"
      />

      <CohortDetails
        name="Java Full Stack"
        startDate="10-Dec-2025"
        status="Completed"
        coach="Alice"
        trainer="Peter"
      />
    </div>
  );
}

export default App;
