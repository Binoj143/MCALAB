#include <stdio.h>

#define MAX_SIZE 100

// Structure to represent a queue
struct Queue {
    int front, rear;
    int arr[MAX_SIZE];
};

// Function to initialize a queue
void initializeQueue(struct Queue *queue) {
    queue->front = -1;
    queue->rear = -1;
}

// Function to check if the queue is empty
int isEmpty(struct Queue *queue) {
    return (queue->front == -1 && queue->rear == -1);
}

// Function to check if the queue is full
int isFull(struct Queue *queue) {
    return (queue->rear == MAX_SIZE - 1);
}

// Function to enqueue an element
void enqueue(struct Queue *queue, int value) {
    if (isFull(queue)) {
        printf("Queue is full. Cannot enqueue.\n");
        return;
    } else if (isEmpty(queue)) {
        queue->front = 0;
        queue->rear = 0;
    } else {
        queue->rear++;
    }

    queue->arr[queue->rear] = value;
    printf("%d enqueued to the queue.\n", value);
}

// Function to dequeue an element
void dequeue(struct Queue *queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty. Cannot dequeue.\n");
        return;
    } else if (queue->front == queue->rear) {
        // If there is only one element in the queue
        printf("%d dequeued from the queue.\n", queue->arr[queue->front]);
        initializeQueue(queue);
    } else {
        printf("%d dequeued from the queue.\n", queue->arr[queue->front]);
        queue->front++;
    }
}

// Function to display the elements in the queue
void display(struct Queue *queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty.\n");
        return;
    }

    printf("Elements in the queue: ");
    for (int i = queue->front; i <= queue->rear; i++) {
        printf("%d ", queue->arr[i]);
    }
    printf("\n");
}

int main() {
    struct Queue queue;
    initializeQueue(&queue);

    int choice, element;

    do {
        printf("\nQueue Menu:\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Quit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the element to enqueue: ");
                scanf("%d", &element);
                enqueue(&queue, element);
                break;

            case 2:
                dequeue(&queue);
                break;

            case 3:
                display(&queue);
                break;

            case 4:
                printf("Exiting the program.\n");
                break;

            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    } while (choice != 4);

    return 0;
}


