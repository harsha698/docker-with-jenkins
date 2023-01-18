FROM alpine:latest
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app/
RUN chmod 755 /usr/src/app/
ENTRYPOINT ["sh", "Script1.sh"]