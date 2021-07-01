
-- Найти всех клиентов, которые в одной из стран: Испания, Италия, Германия, Франция. Отсортируйте по странам
select * from customer
where country in('Spain', 'Italy', 'Germany', 'France')
order by country;

-- Найти всех клиентов, имена которых начинаются на ‘Jo’
select * from customer
where first_name like 'Jo%';

-- Найти всех клиентов, имена которых заканчиваются на ‘a’ и имеют длину ровно 4 символа
select * from customer
where first_name like '%a' and length(first_name) = 4;

-- Найти количество клиентов по странам
select count(id) as amount, country
from customer
group by country;

-- Найти количество клиентов по странам. Вывести в порядке убывания
select count(id) as amount, country
from customer
group by country
order by count(id) desc;

-- Найти общую сумму стоимости заказов и количество заказов по каждому клиенту (customer_id). Отсортировать по сумме
select customer.id, customer.first_name, round(sum(orders.total_amount), 2) as sum, count(orders.customer_id) as amount
from orders
join customer on customer.id = orders.customer_id
group by customer.id
order by sum(orders.total_amount) desc;

-- Найти общую сумму стоимости заказов и количество заказов по каждому клиенту (customer_id), у которых общее количество заказов больше 20ти
select customer.id, customer.first_name, round(sum(orders.total_amount), 1) as sum, count(orders.customer_id) as amount
from orders
join customer on orders.customer_id = customer.id
group by customer.id
having count(orders.customer_id) > 20;

-- Найти количество городов в каждой из стран клиентов
select count(city) as amount, country
from customer
group by country
order by count(city) desc;

/*order_item с id=5
- Выбрать:
	- К какому заказу(номер заказа),
	- Как зовут клиента,
	- Из какого он города
	- Наименование товара
	- Цена товара
	- Название поставщика*/

select orders.order_number, customer.first_name, customer.last_name, customer.city, product.product_name,  order_item.unit_price, supplier.company_name
from order_item
join orders on order_item.order_id = orders.id
join customer on order_item.order_id = orders.id and orders.customer_id = customer.id
join product on product.id = order_item.product_id
join supplier on product.id = order_item.product_id and product.supplier_id = supplier.id
where order_item.id = 5;

-- Узнать есть ли поставщики без товара
select s.id, s.contact_name
from supplier s
join product p on p.supplier_id = s.id
where p.supplier_id is null;

-- Выбрать только те товары которые были заказаны
select p.id, p.product_name
from product p
join order_item o  on p.id = o.product_id
order by p.id asc;


-- Выбрать только те товары которые не были заказаны
select p.id, p.product_name
from product p
join order_item o  on p.id = o.product_id
where o.product_id is null;