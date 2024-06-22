-- 코드를 입력하세요
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, sum(PRICE *  AMOUNT) TOTAL_SALES
-- total_sales의 경우 price * amount의 계산값이여야 하기 때문에 sum함수를 사용하여 계산
FROM FOOD_PRODUCT P JOIN FOOD_ORDER O
ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE PRODUCE_DATE LIKE '2022-05%'
-- 2022년 05월인 식품들만 데이터 추출
GROUP BY PRODUCT_ID
-- 제품당 총액을 구할 수 있도록 product_id로 묶기
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID ASC;