const DataTable = () => {
  return (
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Negócios fechados</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>05/05/2021</td>
            <td>Keizo Kobayashi</td>
            <td>15</td>
            <td>3</td>
            <td>8900.65</td>
          </tr>

          <tr>
            <td>05/05/2021</td>
            <td>João Vitor Alves</td>
            <td>25</td>
            <td>12</td>
            <td>28900.65</td>
          </tr>

          <tr>
            <td>05/05/2021</td>
            <td>Nicholas Fuchs</td>
            <td>50</td>
            <td>32</td>
            <td>62900.65</td>
          </tr>

        </tbody>
      </table>
    </div>
  );
};

export default DataTable;
