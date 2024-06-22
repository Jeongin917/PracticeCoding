-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') -- IFNULL 함수 : NULL일경우(COLUMN명, 'NULL일 경우 대체값')
from FOOD_WAREHOUSE 
where address like '경기도%'
order by WAREHOUSE_ID;