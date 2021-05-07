import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts";
import { SaleSum } from "types/sale";
import { BASE_URL } from "utils/requests";

type ChartData = {
  labels: string[];
  series: number[];
};

const DonutChart = () => {
  
  //USESTATE = OBJETO + FUNÇÃO
  const [chartData, setChartData] = useState<ChartData>({
    labels: [],
    series: [],
  });

  //USEEFFECT = FUNÇÃO, COMPORTAMENTO OBSERVADO
  useEffect(() => {

    axios.get(`${BASE_URL}/sales/amount-by-seller`).then((response) => {
      //CAST
      const data = response.data as SaleSum[];
      const myLabels = data.map((x) => x.sellerName);
      const mySeries = data.map((x) => x.sum);

      setChartData({ labels: myLabels, series: mySeries });
    });
  }, []);

  //FORMA ERRADA

  // const mockData = {
  //     series: [477138, 499928, 444867, 220426, 473088],
  //     labels: ['Keizo', 'Vitor', 'Nicholas', 'Rafael', 'Matheus']
  // }

  const options = {
    legend: {
      show: true,
    },
  };

  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
};

export default DonutChart;
