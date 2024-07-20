
# Run the first Docker Compose file
docker-compose -f ./docker-compose.yml up -d
echo "Waiting for the first Compose to complete..."
sleep 30

# Run the second Docker Compose file
docker-compose -f ./FHIRAPI/hapi-fhir-jpaserver-starter/docker-compose.yml up -d
echo "Waiting for the second Compose to complete..."
sleep 30

# Run the third Docker Compose file
docker-compose -f ./EHR/docker-compose.yml up -d
echo "Waiting for the third Compose to complete..."
sleep 30

echo "All Docker Compose files have been executed."
