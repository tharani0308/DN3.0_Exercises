Exercise 7: Finance Forecasting
------------------------------------------------------------------------------------------------------------------------------

Scenario:

You are developing a financial forecasting tool that predicts future values based on past data.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Moving Average and ARIMA Models
    Moving Average:
      The moving average algorithm calculates the average of a fixed subset of numbers. As new data becomes available, it updates the subset by adding the new data point and removing the oldest one, thereby maintaining a constant window size.

    ARIMA (AutoRegressive Integrated Moving Average):
      The ARIMA model combines three components: autoregression (AR), differencing (I), and moving average (MA). It captures various patterns in time series data by regressing the variable on its own lagged (past) values and the lagged forecast errors, while also applying differencing to make the data stationary.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:

    --> Time Complexity Comparison
        o Moving Average:

           ---> Best Case: O(1) per update
           ---> Average Case: O(n) for initial computation, O(1) per update
           ---> Worst Case: O(n) for initial computation, O(1) per update
   
        o ARIMA:

           ---> Best Case: O(n)
           ---> Average Case: O(n^2)
           ---> Worst Case: O(n^2)
   
    --> Algorithm Suitability

        o Moving Average: Suitable for data with short-term fluctuations and small datasets. It is simple to implement and provides a smooth trend line, but it may not capture complex patterns and long-term trends effectively.

        o ARIMA: More suitable for complex and larger datasets with clear patterns and trends. It can handle various components of time series data, such as trend and seasonality, but it is more complex to implement and requires more computational resources.

------------------------------------------------------------------------------------------------------------------------------
