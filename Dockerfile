# Extend the original KAS container
FROM ghcr.io/siemens/kas/kas:5.2

USER root

RUN set -ex; \
  apt update; \
  apt install iptables -y; \
  rm -rf /var/log/* /tmp/* /var/tmp/* /var/cache/ldconfig/aux-cache

USER builder



