-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
from BOOK
where CATEGORY = '인문'
and PUBLISHED_DATE between '2021-01-01' and '2021-12-31'
order by PUBLISHED_DATE desc;