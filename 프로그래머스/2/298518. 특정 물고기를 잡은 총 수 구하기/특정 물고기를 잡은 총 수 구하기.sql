-- 코드를 작성해주세요
select count(*) AS FISH_COUNT
from FISH_INFO c join FISH_NAME_INFO i
on c.FISH_TYPE = i.FISH_TYPE
where i.fish_name in ('BASS', 'SNAPPER')

-- 정확하게 어느 쿼리에서 데이터를 가져올 것인지 명시하기
-- 그렇지 않으면 중복 오류 발생