FROM alpine:latest as base
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app/
RUN chmod 755 /usr/src/app/
CMD echo HELLO

FROM base
ENTRYPOINT ["sh", "enter_name.sh"]