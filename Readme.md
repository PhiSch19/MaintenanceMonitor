#Maintenance Monitor
<p>an Application to set Maintenance State of a Service and inform users about the current state via a Website</p>

<div>
    <h4>Company Introduction</h4>
<article>
    We are a small hydro-power electricity supplier near Vienna. Our customers expect electricity
around the clock with a service level agreement of 99.95%. This means that the maximum
outage of 21 minutes and 54 seconds (monthly in sum) is tolerated. It is easy to derive that
service times are very important to us. Huge monitors were installed that should show
• a green monitor in case everything looks fine and
• a red monitor in case of problems.
All monitors show the same content: a maximized website.
</article>
</div>

<div>
<h4>How To:</h4>
    <ul>
        <li>
            <p>Set state via post endpoint "/api/maintenanceMode"</p>
            <p>param maintenance: bool</p>
            <p>param message: str (will be null if maintenance is true)</p>
        <li>
            <p>Fetch Maintenance state via get endpoint ""/api/maintenanceMode"</p>
            <p>no params: return Json params: maintenace:bool, message: String</p>
    </ul>
</div>