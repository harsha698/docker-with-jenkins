FROM 6789012345/myjdk-alpine:latest
WORKDIR /output
RUN touch output.txt
RUN printenv >> output.txt
CMD ["cat", "output.txt" ]