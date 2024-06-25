-- 코드를 작성해주세요
select ID, LENGTH
from FISH_INFO 
order by LENGTH desc, ID
limit 10;
-- mysql은 limit 함수를 사용하여 일정개수 출력 가능